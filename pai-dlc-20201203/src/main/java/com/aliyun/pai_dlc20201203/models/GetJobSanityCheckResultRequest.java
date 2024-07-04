// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobSanityCheckResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SanityCheckNumber")
    public Integer sanityCheckNumber;

    /**
     * <strong>example:</strong>
     * <p>DeviceCheck</p>
     */
    @NameInMap("SanityCheckPhase")
    public String sanityCheckPhase;

    @NameInMap("Token")
    public String token;

    public static GetJobSanityCheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobSanityCheckResultRequest self = new GetJobSanityCheckResultRequest();
        return TeaModel.build(map, self);
    }

    public GetJobSanityCheckResultRequest setSanityCheckNumber(Integer sanityCheckNumber) {
        this.sanityCheckNumber = sanityCheckNumber;
        return this;
    }
    public Integer getSanityCheckNumber() {
        return this.sanityCheckNumber;
    }

    public GetJobSanityCheckResultRequest setSanityCheckPhase(String sanityCheckPhase) {
        this.sanityCheckPhase = sanityCheckPhase;
        return this;
    }
    public String getSanityCheckPhase() {
        return this.sanityCheckPhase;
    }

    public GetJobSanityCheckResultRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
