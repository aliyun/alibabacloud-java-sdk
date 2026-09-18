// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobSanityCheckResultRequest extends TeaModel {
    /**
     * <p>The sequence number of the computing power health check for the job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SanityCheckNumber")
    public Integer sanityCheckNumber;

    /**
     * <p>The phase of the computing power health check. Valid values:</p>
     * <ul>
     * <li>CheckInit: environment preparation check.</li>
     * <li>DeviceCheck: single-card computing power check.</li>
     * <li>SingleNodeCommCheck: intra-node communication check.</li>
     * <li>TwoNodeCommCheck: two-node communication check.</li>
     * <li>AllNodeCommCheck: all-node communication check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DeviceCheck</p>
     */
    @NameInMap("SanityCheckPhase")
    public String sanityCheckPhase;

    /**
     * <p>The token information in the job sharing token. To obtain the token, see <a href="https://help.aliyun.com/document_detail/2557812.html">GetToken</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbG<strong><strong><strong>zI1NiIsInR5cCI6IkpXVCJ9.eyJle</strong></strong>jE3MDk1Mzk0NDIsImlhdCI6MTcwODkzNDY0MiwidXNlcl9pZCI6IjE3NTgwNTQxNjI0Mzg2NTUiLCJ0YXJnZXRfaWQiOiJkbGM1OGh1a2xyYzZwdGMyIiwidGFyZ2V0X3R5cGUiOiJqb2IifQ.GNL7jo6</strong><strong>mgKKv0QeGIYgvBufSU-PH_EQttX</strong>**</p>
     */
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
