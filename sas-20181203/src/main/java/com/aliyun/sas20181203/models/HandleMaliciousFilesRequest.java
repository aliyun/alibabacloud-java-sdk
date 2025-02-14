// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleMaliciousFilesRequest extends TeaModel {
    /**
     * <p>List of file IDs to be processed.</p>
     * <blockquote>
     * <h2>You can call <a href="~~ListAgentlessMaliciousFiles~~">ListAgentlessMaliciousFiles</a> to get the IDs.</h2>
     * </blockquote>
     */
    @NameInMap("FileIdList")
    public java.util.List<Long> fileIdList;

    /**
     * <p>Type of operation:</p>
     * <ul>
     * <li>addWhitelist: Add to whitelist</li>
     * <li>offWhitelist: Remove from whitelist</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>addWhitelist</p>
     */
    @NameInMap("Operation")
    public String operation;

    public static HandleMaliciousFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleMaliciousFilesRequest self = new HandleMaliciousFilesRequest();
        return TeaModel.build(map, self);
    }

    public HandleMaliciousFilesRequest setFileIdList(java.util.List<Long> fileIdList) {
        this.fileIdList = fileIdList;
        return this;
    }
    public java.util.List<Long> getFileIdList() {
        return this.fileIdList;
    }

    public HandleMaliciousFilesRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

}
