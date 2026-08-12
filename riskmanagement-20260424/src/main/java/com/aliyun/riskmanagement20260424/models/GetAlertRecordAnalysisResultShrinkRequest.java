// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetAlertRecordAnalysisResultShrinkRequest extends TeaModel {
    /**
     * <p>The unique identifier of the alert event. (Deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>9b57f0fcf98181df8d8487d1cc91cb8d</p>
     */
    @NameInMap("AlarmUniqueInfo")
    public String alarmUniqueInfo;

    /**
     * <p>The language of the content. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>The unique ID of the alert event. (Deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>fc312aa0c32ba8a6147db6221fb1c1ee</p>
     */
    @NameInMap("UniqueInfo")
    public String uniqueInfo;

    /**
     * <p>The array of tracing requests.</p>
     */
    @NameInMap("UniqueTagList")
    public String uniqueTagListShrink;

    /**
     * <p>The unique identifier of the asset. (Deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>ebde6d4e3e4aba728962eec43a69196e9J7tt7H47Pc</p>
     */
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
