// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetAlertRecordAnalysisResultShrinkRequest extends TeaModel {
    @NameInMap("AlarmUniqueInfo")
    public String alarmUniqueInfo;

    @NameInMap("AliyunLang")
    public String aliyunLang;

    @NameInMap("UniqueInfo")
    public String uniqueInfo;

    @NameInMap("UniqueTagList")
    public String uniqueTagListShrink;

    @NameInMap("Uuid")
    public String uuid;

    public static GetAlertRecordAnalysisResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertRecordAnalysisResultShrinkRequest self = new GetAlertRecordAnalysisResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertRecordAnalysisResultShrinkRequest setAlarmUniqueInfo(String alarmUniqueInfo) {
        this.alarmUniqueInfo = alarmUniqueInfo;
        return this;
    }
    public String getAlarmUniqueInfo() {
        return this.alarmUniqueInfo;
    }

    public GetAlertRecordAnalysisResultShrinkRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public GetAlertRecordAnalysisResultShrinkRequest setUniqueInfo(String uniqueInfo) {
        this.uniqueInfo = uniqueInfo;
        return this;
    }
    public String getUniqueInfo() {
        return this.uniqueInfo;
    }

    public GetAlertRecordAnalysisResultShrinkRequest setUniqueTagListShrink(String uniqueTagListShrink) {
        this.uniqueTagListShrink = uniqueTagListShrink;
        return this;
    }
    public String getUniqueTagListShrink() {
        return this.uniqueTagListShrink;
    }

    public GetAlertRecordAnalysisResultShrinkRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
