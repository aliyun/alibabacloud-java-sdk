// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleMaliciousFilesRequest extends TeaModel {
    /**
     * <p>The list of file IDs to process.</p>
     * <blockquote>
     * <p>You can call <a href="~~ListAgentlessMaliciousFiles~~">ListAgentlessMaliciousFiles</a> to obtain the IDs.
     * -.</p>
     * </blockquote>
     */
    @NameInMap("FileIdList")
    public java.util.List<Long> fileIdList;

    /**
     * <p>The type of operation. Valid values:</p>
     * <ul>
     * <li>addWhitelist: adds to the whitelist.</li>
     * <li>offWhitelist: removes from the whitelist.</li>
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
