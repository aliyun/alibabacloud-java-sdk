// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class EnablePolicyTypeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6E27F22C-EDA3-132E-A53F-77DE3BC2343D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnablePolicyTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnablePolicyTypeResponseBody self = new EnablePolicyTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public EnablePolicyTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
