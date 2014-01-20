package me.horzwxy.app.wordbook.network;

/**
 * Callbacks of Uploader class.
 */
public interface UploaderListener {

    /**
     * Callback of uploading message.
     * @param taskId ID of uploading task
     * @param succeeded whether the uploading task has succeeded
     * @param msg The message uploaded or intent to be uploaded
     */
    public void onUploaded(int taskId, boolean succeeded, UploadMessage msg);

    /**
     * Notify the caller about the current state of updating.
     * @param currentState string representation of current updating state
     */
    public void onStateUpdated(String currentState);
}
