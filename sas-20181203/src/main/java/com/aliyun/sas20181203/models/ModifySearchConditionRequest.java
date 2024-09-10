// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySearchConditionRequest extends TeaModel {
    /**
     * <p>The filter condition. The value of this parameter is in the JSON format and is case-sensitive. The value contains the following fields:</p>
     * <ul>
     * <li><p><strong>filterParams</strong>: the filter-related parameters. The value is in the JSON format. Valid values:</p>
     * <ul>
     * <li><p><strong>label</strong>: the display name of the filter condition in the console.</p>
     * </li>
     * <li><p><strong>value</strong>: the settings of the filter condition. The value is in the JSON format. The value contains the following fields:</p>
     * <ul>
     * <li><strong>name</strong>: the name of the field for filtering. For more information, see the value description of name.</li>
     * <li><strong>value</strong>: the value of the field for filtering.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>LogicalExp</strong>: the logical relationship among multiple filter conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong></li>
     * <li><strong>AND</strong></li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> Value description of <strong>name</strong>:</p>
     * </blockquote>
     * <ul>
     * <li><p>If <strong>Type</strong> is set to <strong>ecs</strong>, you can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported filter conditions.</p>
     * </li>
     * <li><p>If <strong>Type</strong> is set to <strong>cloud_product</strong>, you can call the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation to query the supported filter conditions.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;filterParams&quot;: [
     *         {
     *             &quot;label&quot;: &quot;UUID：xxx&quot;,
     *             &quot;value&quot;: &quot;{\&quot;name\&quot;:\&quot;uuidList\&quot;,\&quot;value\&quot;:\&quot;xxx\&quot;}&quot;
     *         }
     *     ],
     *     &quot;LogicalExp&quot;: &quot;OR&quot;
     * }</p>
     */
    @NameInMap("FilterConditions")
    public String filterConditions;

    /**
     * <p>The name of the common filter condition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>27.223.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the asset. Default value: <strong>ecs</strong>. Valid values:</p>
     * <ul>
     * <li><strong>ecs</strong>: host</li>
     * <li><strong>cloud_product</strong>: Alibaba Cloud service</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Type")
    public String type;

    public static ModifySearchConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySearchConditionRequest self = new ModifySearchConditionRequest();
        return TeaModel.build(map, self);
    }

    public ModifySearchConditionRequest setFilterConditions(String filterConditions) {
        this.filterConditions = filterConditions;
        return this;
    }
    public String getFilterConditions() {
        return this.filterConditions;
    }

    public ModifySearchConditionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifySearchConditionRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifySearchConditionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
