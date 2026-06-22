// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySearchConditionRequest extends TeaModel {
    /**
     * <p>The filter conditions. This parameter is in JSON format. Pay attention to the letter case when you specify this parameter. The following fields are included:</p>
     * <ul>
     * <li><p><strong>filterParams</strong>: The filter parameters. This parameter is in JSON format. The following fields are included:</p>
     * <ul>
     * <li><p><strong>label</strong>: The display name for the search in the console.</p>
     * </li>
     * <li><p><strong>value</strong>: The filter parameter condition. This parameter is in JSON format. The following fields are included:</p>
     * <ul>
     * <li><strong>name</strong>: The filter condition field. For more information about the valid values of this field, see the description below.</li>
     * <li><strong>value</strong>: The value that corresponds to the filter condition field.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>LogicalExp</strong>: The logical relationship between multiple filter conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: or</li>
     * <li><strong>AND</strong>: and<blockquote>
     * <p>Valid values of <strong>name</strong>:</p>
     * <ul>
     * <li>If <strong>Type</strong> is set to <strong>ecs</strong>, call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</li>
     * <li>If <strong>Type</strong> is set to <strong>cloud_product</strong>, call the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation to query the supported search conditions.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
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
     * <p>The source IP address of the request. You do not need to specify this parameter. The system automatically obtains the value.</p>
     * 
     * <strong>example:</strong>
     * <p>27.223.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The asset type. Default value: <strong>ecs</strong>. Valid values:</p>
     * <ul>
     * <li><strong>ecs</strong>: host asset</li>
     * <li><strong>cloud_product</strong>: cloud service.</li>
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
