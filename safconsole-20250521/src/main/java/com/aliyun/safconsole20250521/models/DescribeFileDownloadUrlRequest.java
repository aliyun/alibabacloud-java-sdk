// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeFileDownloadUrlRequest extends TeaModel {
    /**
     * <p>File ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>Project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DescribeFileDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileDownloadUrlRequest self = new DescribeFileDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFileDownloadUrlRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public DescribeFileDownloadUrlRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
