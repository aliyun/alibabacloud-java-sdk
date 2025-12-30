// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIFileUploadRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pattern_test.csv</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    public static ChatBIFileUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatBIFileUploadRequest self = new ChatBIFileUploadRequest();
        return TeaModel.build(map, self);
    }

    public ChatBIFileUploadRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ChatBIFileUploadRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
