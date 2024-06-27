// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRequestHitRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sRequestId")
    public String sRequestId;

    public static DescribeRequestHitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestHitRequest self = new DescribeRequestHitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRequestHitRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRequestHitRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeRequestHitRequest setSRequestId(String sRequestId) {
        this.sRequestId = sRequestId;
        return this;
    }
    public String getSRequestId() {
        return this.sRequestId;
    }

}
