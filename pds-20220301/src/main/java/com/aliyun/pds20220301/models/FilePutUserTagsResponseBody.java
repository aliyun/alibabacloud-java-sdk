// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FilePutUserTagsResponseBody extends TeaModel {
    /**
     * <p>The file ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9520943DC264</p>
     */
    @NameInMap("file_id")
    public String fileId;

    public static FilePutUserTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FilePutUserTagsResponseBody self = new FilePutUserTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public FilePutUserTagsResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
