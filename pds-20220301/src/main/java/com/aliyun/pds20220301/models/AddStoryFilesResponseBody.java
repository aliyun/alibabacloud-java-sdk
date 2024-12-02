// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AddStoryFilesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("files")
    public java.util.List<AddStoryFile> files;

    @NameInMap("request_id")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>9132e0d8-fe92-4e56-86c3-f5f112308003</p>
     */
    @NameInMap("story_id")
    public String storyId;

    public static AddStoryFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddStoryFilesResponseBody self = new AddStoryFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddStoryFilesResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public AddStoryFilesResponseBody setFiles(java.util.List<AddStoryFile> files) {
        this.files = files;
        return this;
    }
    public java.util.List<AddStoryFile> getFiles() {
        return this.files;
    }

    public AddStoryFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddStoryFilesResponseBody setStoryId(String storyId) {
        this.storyId = storyId;
        return this;
    }
    public String getStoryId() {
        return this.storyId;
    }

}
