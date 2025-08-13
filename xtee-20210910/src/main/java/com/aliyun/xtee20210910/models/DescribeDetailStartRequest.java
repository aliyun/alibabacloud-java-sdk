// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDetailStartRequest extends TeaModel {
    /**
     * <p>Application appkey.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("appKey")
    public String appKey;

    /**
     * <p>End time</p>
     * <p>Format yyyymmdd</p>
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
     * <p>Called service</p>
     * 
     * <strong>example:</strong>
     * <p>service_tender_cee</p>
     */
    @NameInMap("service")
    public String service;

    /**
     * <p>Start time</p>
     * <p> Format yyyymmdd</p>
     * 
     * <strong>example:</strong>
     * <p>20250310</p>
     */
    @NameInMap("startDs")
    public String startDs;

    public static DescribeDetailStartRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDetailStartRequest self = new DescribeDetailStartRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDetailStartRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeDetailStartRequest setEndDs(String endDs) {
        this.endDs = endDs;
        return this;
    }
    public String getEndDs() {
        return this.endDs;
    }

    public DescribeDetailStartRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeDetailStartRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public DescribeDetailStartRequest setStartDs(String startDs) {
        this.startDs = startDs;
        return this;
    }
    public String getStartDs() {
        return this.startDs;
    }

}
