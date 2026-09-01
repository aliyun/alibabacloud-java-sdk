// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateSelectionKeyByTypeRequest extends TeaModel {
    /**
     * <p>The business type of the asset selection. Valid values:</p>
     * <ul>
     * <li><strong>VIRUS_SCAN_CYCLE_CONFIG</strong>: virus scan configuration.</li>
     * <li><strong>VIRUS_SCAN_ONCE_TASK</strong>: one-time virus scan task.</li>
     * <li><strong>AGENTLESS_MALICIOUS_WHITE_LIST_[ID]</strong>: agentless detection alert whitelisting rule.</li>
     * <li><strong>AGENTLESS_VUL_WHITE_LIST_[ID]</strong>: agentless detection vulnerability whitelisting rule.</li>
     * <li><strong>FILE_PROTECT_RULE_SWITCH_TYPE_[ID]</strong>: core file protection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VIRUS_SCAN_CYCLE_CONFIG</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Different requests should use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The unique identifier of the asset selection.</p>
     * 
     * <strong>example:</strong>
     * <p>614d179e-4776-4939-a04a-d842ce64****</p>
     */
    @NameInMap("SelectionKey")
    public String selectionKey;

    public static UpdateSelectionKeyByTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSelectionKeyByTypeRequest self = new UpdateSelectionKeyByTypeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSelectionKeyByTypeRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public UpdateSelectionKeyByTypeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSelectionKeyByTypeRequest setSelectionKey(String selectionKey) {
        this.selectionKey = selectionKey;
        return this;
    }
    public String getSelectionKey() {
        return this.selectionKey;
    }

}
