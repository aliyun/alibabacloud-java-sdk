// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAssetSelectionConfigRequest extends TeaModel {
    /**
     * <p>The business type of the asset selection. Valid values:</p>
     * <ul>
     * <li><strong>VIRUS_SCAN_CYCLE_CONFIG</strong>: trojan scan configuration</li>
     * <li><strong>VIRUS_SCAN_ONCE_TASK</strong>: trojan scan one-time scan</li>
     * <li><strong>AGENTLESS_MALICIOUS_WHITE_LIST_[ID]</strong>: agentless detection alert whitelisting rule</li>
     * <li><strong>AGENTLESS_VUL_WHITE_LIST_[ID]</strong>: agentless detection vulnerability whitelisting rule</li>
     * <li><strong>FILE_PROTECT_RULE_SWITCH_TYPE_[ID]</strong>: core file protection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VIRUS_SCAN_CYCLE_CONFIG</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    public static GetAssetSelectionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssetSelectionConfigRequest self = new GetAssetSelectionConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAssetSelectionConfigRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

}
