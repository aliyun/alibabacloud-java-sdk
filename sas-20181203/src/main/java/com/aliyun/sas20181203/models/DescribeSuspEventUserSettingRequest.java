// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventUserSettingRequest extends TeaModel {
    /**
     * <p>The ID of the request source. Set the value to **sas**.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID. You do not need to specify this parameter.</p>
     */
    @NameInMap("Id")
    public Integer id;

    /**
     * <p>The IP address of the request. You do not need to specify this parameter.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeSuspEventUserSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventUserSettingRequest self = new DescribeSuspEventUserSettingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventUserSettingRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeSuspEventUserSettingRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public DescribeSuspEventUserSettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
