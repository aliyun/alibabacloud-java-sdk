// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAgentlessTaskCountBatchRequest extends TeaModel {
    /**
     * <p>The detection object type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: host snapshot</li>
     * <li><strong>2</strong>: host image</li>
     * <li><strong>3</strong>: user snapshot</li>
     * <li><strong>4</strong>: user image</li>
     * <li><strong>5</strong>: NAS file system</li>
     * <li><strong>6</strong>: parallel sandbox</li>
     * <li><strong>7</strong>: security fix</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TargetType")
    public Integer targetType;

    /**
     * <p>The list of resource UUIDs to query. The list can contain 1 to 100 elements.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;]</p>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static GetAgentlessTaskCountBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentlessTaskCountBatchRequest self = new GetAgentlessTaskCountBatchRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentlessTaskCountBatchRequest setTargetType(Integer targetType) {
        this.targetType = targetType;
        return this;
    }
    public Integer getTargetType() {
        return this.targetType;
    }

    public GetAgentlessTaskCountBatchRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
