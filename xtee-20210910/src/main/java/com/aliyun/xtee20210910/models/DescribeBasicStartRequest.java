// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeBasicStartRequest extends TeaModel {
    @NameInMap("appKey")
    public String appKey;

    @NameInMap("endDs")
    public String endDs;

    @NameInMap("regId")
    public String regId;

    @NameInMap("service")
    public String service;

    @NameInMap("startDs")
    public String startDs;

    public static DescribeBasicStartRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBasicStartRequest self = new DescribeBasicStartRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBasicStartRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeBasicStartRequest setEndDs(String endDs) {
        this.endDs = endDs;
        return this;
    }
    public String getEndDs() {
        return this.endDs;
    }

    public DescribeBasicStartRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeBasicStartRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public DescribeBasicStartRequest setStartDs(String startDs) {
        this.startDs = startDs;
        return this;
    }
    public String getStartDs() {
        return this.startDs;
    }

}
