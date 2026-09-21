// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCriteriaRequest extends TeaModel {
    /**
     * <p>The Asset Type to query. Valid values:</p>
     * <ul>
     * <li><strong>ecs</strong>: queries all ECS servers.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypes;

    /**
     * <p>The ID of the Alibaba Cloud account of the member accounts in the resource folder.</p>
     * <blockquote>
     * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>Specifies whether the fuzzy query field supports automatic matching. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Supported.</li>
     * <li><strong>false</strong>: Not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SupportAutoTag")
    public Boolean supportAutoTag;

    /**
     * <p>The fuzzy match value entered when querying assets.</p>
     * 
     * <strong>example:</strong>
     * <p>47.96</p>
     */
    @NameInMap("Value")
    public String value;

    public static DescribeCriteriaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCriteriaRequest self = new DescribeCriteriaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCriteriaRequest setMachineTypes(String machineTypes) {
        this.machineTypes = machineTypes;
        return this;
    }
    public String getMachineTypes() {
        return this.machineTypes;
    }

    public DescribeCriteriaRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeCriteriaRequest setSupportAutoTag(Boolean supportAutoTag) {
        this.supportAutoTag = supportAutoTag;
        return this;
    }
    public Boolean getSupportAutoTag() {
        return this.supportAutoTag;
    }

    public DescribeCriteriaRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
