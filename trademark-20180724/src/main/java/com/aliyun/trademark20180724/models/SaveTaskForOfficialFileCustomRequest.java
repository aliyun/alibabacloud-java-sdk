// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SaveTaskForOfficialFileCustomRequest extends TeaModel {
    @NameInMap("EndAcceptTime")
    public Long endAcceptTime;

    @NameInMap("StartAcceptTime")
    public Long startAcceptTime;

    public static SaveTaskForOfficialFileCustomRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForOfficialFileCustomRequest self = new SaveTaskForOfficialFileCustomRequest();
        return TeaModel.build(map, self);
    }

    public SaveTaskForOfficialFileCustomRequest setEndAcceptTime(Long endAcceptTime) {
        this.endAcceptTime = endAcceptTime;
        return this;
    }
    public Long getEndAcceptTime() {
        return this.endAcceptTime;
    }

    public SaveTaskForOfficialFileCustomRequest setStartAcceptTime(Long startAcceptTime) {
        this.startAcceptTime = startAcceptTime;
        return this;
    }
    public Long getStartAcceptTime() {
        return this.startAcceptTime;
    }

}
