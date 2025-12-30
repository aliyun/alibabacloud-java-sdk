// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ChatBIFileTemplateDownloadRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pattern/config</p>
     */
    @NameInMap("TableType")
    public String tableType;

    public static ChatBIFileTemplateDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatBIFileTemplateDownloadRequest self = new ChatBIFileTemplateDownloadRequest();
        return TeaModel.build(map, self);
    }

    public ChatBIFileTemplateDownloadRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ChatBIFileTemplateDownloadRequest setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

}
