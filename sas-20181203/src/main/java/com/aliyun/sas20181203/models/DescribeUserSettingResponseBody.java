// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUserSettingResponseBody extends TeaModel {
    /**
     * <p>The list of alert notification levels. If the list is empty, no alerts are generated for custom policies.</p>
     */
    @NameInMap("AlertLevels")
    public java.util.List<String> alertLevels;

    /**
     * <p>The number of days to retain invalid alerts.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("InvalidWarningKeepDays")
    public Integer invalidWarningKeepDays;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserSettingResponseBody self = new DescribeUserSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserSettingResponseBody setAlertLevels(java.util.List<String> alertLevels) {
        this.alertLevels = alertLevels;
        return this;
    }
    public java.util.List<String> getAlertLevels() {
        return this.alertLevels;
    }

    public DescribeUserSettingResponseBody setInvalidWarningKeepDays(Integer invalidWarningKeepDays) {
        this.invalidWarningKeepDays = invalidWarningKeepDays;
        return this;
    }
    public Integer getInvalidWarningKeepDays() {
        return this.invalidWarningKeepDays;
    }

    public DescribeUserSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
