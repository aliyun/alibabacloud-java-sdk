// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GetPolarClawSkillRegionResponseBody extends TeaModel {
    /**
     * <p>The OSS bucket that stores images.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-bucket-test</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPolarClawSkillRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolarClawSkillRegionResponseBody self = new GetPolarClawSkillRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolarClawSkillRegionResponseBody setOSSBucket(String OSSBucket) {
        this.OSSBucket = OSSBucket;
        return this;
    }
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    public GetPolarClawSkillRegionResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetPolarClawSkillRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
