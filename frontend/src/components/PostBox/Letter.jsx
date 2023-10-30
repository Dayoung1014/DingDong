import styles from "./Letter.module.css"
import { useSetRecoilState } from "recoil"
import {
  isPostBoxVisibleAtom,
  isReceiveLetterVisibleAtom,
} from "../../atom/PostAtom"

const Letter = ({ letterTitle, checkRead }) => {
  const setIsPostBoxVisible = useSetRecoilState(isPostBoxVisibleAtom)
  const setIsReceiveLetterVisible = useSetRecoilState(
    isReceiveLetterVisibleAtom
  )

  const openReceiveLetter = () => {
    setIsPostBoxVisible(false)
    setIsReceiveLetterVisible(true)
  }

  return (
    <div className={styles.letterContainer} onClick={openReceiveLetter}>
      {checkRead ? (
        <></>
      ) : (
        <img
          src="/assets/icons/redDot.svg"
          className={styles.noRead}
        />
      )}
      <img src="/assets/icons/writingPad.svg" alt="" />
      <div className={styles.letterTitle}>{letterTitle}</div>
    </div>
  )
}

export default Letter
