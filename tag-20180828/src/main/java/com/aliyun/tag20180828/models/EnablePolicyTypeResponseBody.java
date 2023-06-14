// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class EnablePolicyTypeResponseBody extends TeaModel {
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
