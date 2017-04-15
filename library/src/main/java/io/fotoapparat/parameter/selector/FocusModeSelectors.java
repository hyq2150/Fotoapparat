package io.fotoapparat.parameter.selector;

import io.fotoapparat.parameter.FocusMode;

/**
 * Selector functions for {@link FocusMode}.
 */
public class FocusModeSelectors {

	/**
	 * @return {@link SelectorFunction} which provides a non-adjustable focus mode if available.
	 * Otherwise provides {@code null}.
	 */
	public static SelectorFunction<FocusMode> fixed() {
		return focusMode(FocusMode.FIXED);
	}

	/**
	 * @return {@link SelectorFunction} which provides a focus mode targeting infinity if available.
	 * Otherwise provides {@code null}.
	 */
	public static SelectorFunction<FocusMode> infinity() {
		return focusMode(FocusMode.INFINITY);
	}

	/**
	 * @return {@link SelectorFunction} which provides a macro focus mode if available.
	 * Otherwise provides {@code null}.
	 */
	public static SelectorFunction<FocusMode> macro() {
		return focusMode(FocusMode.MACRO);
	}

	/**
	 * @return {@link SelectorFunction} which provides an auto focus mode if available.
	 * Otherwise provides {@code null}.
	 */
	public static SelectorFunction<FocusMode> auto() {
		return focusMode(FocusMode.AUTO);
	}

	/**
	 * @return {@link SelectorFunction} which provides a focus mode which constantly tries to stay
	 * in focus if available.
	 * Otherwise provides {@code null}.
	 */
	public static SelectorFunction<FocusMode> continuousFocus() {
		return focusMode(FocusMode.CONTINUOUS_FOCUS);
	}

	/**
	 * @return {@link SelectorFunction} which provides a focus mode which will produce images with
	 * an extended depth of field if available.
	 * Otherwise provides {@code null}.
	 */
	public static SelectorFunction<FocusMode> edof() {
		return focusMode(FocusMode.EDOF);
	}

	/**
	 * @return function which selects given {@link FocusMode} from the list if it is available. If
	 * it is not available - provides {@code null}.
	 */
	private static SelectorFunction<FocusMode> focusMode(final FocusMode focusMode) {
		return Selectors.single(focusMode);
	}

}
