// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventUserSettingRequest extends TeaModel {
    @NameInMap("From")
    public String from;

    @NameInMap("Id")
    public Integer id;

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
