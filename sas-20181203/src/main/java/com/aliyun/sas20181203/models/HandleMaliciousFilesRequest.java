// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleMaliciousFilesRequest extends TeaModel {
    /**
     * <p>The list of IDs of the files to be processed.</p>
     * <blockquote>
     * <h2>You can call the <a href="~~ListAgentlessMaliciousFiles~~">ListAgentlessMaliciousFiles</a> operation to obtain the IDs.</h2>
     * </blockquote>
     */
    @NameInMap("FileIdList")
    public java.util.List<Long> fileIdList;

    /**
     * <p>The type of the operation. Valid values:</p>
     * <ul>
     * <li>addWhitelist: Adds the security alerts to the whitelist.</li>
     * <li>offWhitelist: Removes the security alerts from the whitelist.</li>
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
