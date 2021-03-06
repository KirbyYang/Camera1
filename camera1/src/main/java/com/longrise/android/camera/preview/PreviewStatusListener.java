package com.longrise.android.camera.preview;

import android.hardware.Camera;

/**
 * Created by godliness on 2020-07-01.
 *
 * @author godliness
 * 用于监听Camera的预览状态，和相机打开
 */
public interface PreviewStatusListener {

    /**
     * 预览状态{@link Status}
     */
    void onPreviewStatus(int status, String extra);

    /**
     * 相机已打开
     */
    void onCameraOpened(Camera.Parameters basic);
}
