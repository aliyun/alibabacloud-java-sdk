// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class DownloadMultimodalSearchTaskResultMetadataRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>白色汽车</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DownloadMultimodalSearchTaskResultMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadMultimodalSearchTaskResultMetadataRequest self = new DownloadMultimodalSearchTaskResultMetadataRequest();
        return TeaModel.build(map, self);
    }

    public DownloadMultimodalSearchTaskResultMetadataRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DownloadMultimodalSearchTaskResultMetadataRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
