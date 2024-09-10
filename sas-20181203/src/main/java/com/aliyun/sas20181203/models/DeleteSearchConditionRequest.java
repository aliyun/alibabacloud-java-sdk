// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSearchConditionRequest extends TeaModel {
    /**
     * <p>The name of the frequently used search condition.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeSearchCondition~~">DescribeSearchCondition</a> operation to query frequently used search conditions.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>19.12.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the asset. Default value: ecs. Valid values:</p>
     * <ul>
     * <li><strong>ecs</strong>: an Elastic Compute Service (ECS) instance.</li>
     * <li><strong>cloud_product</strong>: an Alibaba Cloud service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Type")
    public String type;

    public static DeleteSearchConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSearchConditionRequest self = new DeleteSearchConditionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSearchConditionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteSearchConditionRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteSearchConditionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
