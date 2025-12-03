// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenOperateInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1634725571000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeScreenOperateInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenOperateInfoRequest self = new DescribeScreenOperateInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScreenOperateInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeScreenOperateInfoRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
