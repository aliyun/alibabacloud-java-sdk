// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseCodeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>The client generates the value of this parameter. Ensure that the value is unique among different requests. The value can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The enterprise code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12***</p>
     */
    @NameInMap("EnterpriseCode")
    public String enterpriseCode;

    /**
     * <p>The region ID.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> to query the regions supported by Smart Access Gateway and the corresponding region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteEnterpriseCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseCodeRequest self = new DeleteEnterpriseCodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseCodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteEnterpriseCodeRequest setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
        return this;
    }
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    public DeleteEnterpriseCodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
