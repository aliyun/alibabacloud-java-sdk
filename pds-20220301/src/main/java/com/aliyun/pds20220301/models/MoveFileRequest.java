// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class MoveFileRequest extends TeaModel {
    /**
     * <p>The processing method that is used if the file that you want to move has the same name as an existing file in the destination directory. Valid values:</p>
     * <br>
     * <p>ignore: allows you to move the file by using the same name as an existing file in the destination directory.</p>
     * <br>
     * <p>auto_rename: automatically renames the file that has the same name exists in the destination directory. By default, the current point in time is added to the end of the file name. Example: xxx\_20060102\_150405.</p>
     * <br>
     * <p>refuse: does not move the file that you want to move but returns the information about the file that has the same name in the destination directory.</p>
     * <br>
     * <p>Default value: ignore.</p>
     */
    @NameInMap("check_name_mode")
    public String checkNameMode;

    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The ID of the destination parent directory to which you want to move a file or folder. If you want to move a file or folder to the root directory, set this parameter to root.</p>
     */
    @NameInMap("to_parent_file_id")
    public String toParentFileId;

    public static MoveFileRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveFileRequest self = new MoveFileRequest();
        return TeaModel.build(map, self);
    }

    public MoveFileRequest setCheckNameMode(String checkNameMode) {
        this.checkNameMode = checkNameMode;
        return this;
    }
    public String getCheckNameMode() {
        return this.checkNameMode;
    }

    public MoveFileRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public MoveFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public MoveFileRequest setToParentFileId(String toParentFileId) {
        this.toParentFileId = toParentFileId;
        return this;
    }
    public String getToParentFileId() {
        return this.toParentFileId;
    }

}
