// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeBasicStartRequest extends TeaModel {
    /**
     * <p>Application appkey.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("appKey")
    public String appKey;

    /**
     * <p>End time, accurate to milliseconds (ms).</p>
     * 
     * <strong>example:</strong>
     * <p>20250320</p>
     */
    @NameInMap("endDs")
    public String endDs;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Service to call</p>
     * 
     * <strong>example:</strong>
     * <p>service_tender_cee</p>
     */
    @NameInMap("service")
    public String service;

    /**
     * <p>Start time, accurate to milliseconds (ms).</p>
     * 
     * <strong>example:</strong>
     * <p>20250310</p>
     */
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
