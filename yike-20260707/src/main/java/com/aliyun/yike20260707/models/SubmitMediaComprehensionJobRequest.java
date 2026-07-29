// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitMediaComprehensionJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;ProductName&quot;:&quot;Quiet Blender Soymilk Maker&quot;,&quot;BrandName&quot;:&quot;LiangChu&quot;,&quot;SellingPoints&quot;:[&quot;Low-noise blending&quot;,&quot;One-touch self-cleaning&quot;]}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitMediaComprehensionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaComprehensionJobRequest self = new SubmitMediaComprehensionJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaComprehensionJobRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitMediaComprehensionJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
