// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobSanityCheckResultRequest extends TeaModel {
    /**
     * <p>The nth time for which the job sanity check is performed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SanityCheckNumber")
    public Integer sanityCheckNumber;

    /**
     * <p>The phase in which the job sanity check is performed.</p>
     * <ul>
     * <li>CheckInit</li>
     * <li>DeviceCheck</li>
     * <li>SingleNodeCommCheck</li>
     * <li>TwoNodeCommCheck</li>
     * <li>AllNodeCommCheck</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DeviceCheck</p>
     */
    @NameInMap("SanityCheckPhase")
    public String sanityCheckPhase;

    /**
     * <p>The token information for job sharing. For more information about how to obtain the token information, see <a href="https://help.aliyun.com/document_detail/2557812.html">GetToken</a>.</p>
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
