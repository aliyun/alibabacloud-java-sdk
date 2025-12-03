// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenSettingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LogoPower")
    public Boolean logoPower;

    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.XXXXXXXXXXX.jpg">https://img.alicdn.XXXXXXXXXXX.jpg</a></p>
     */
    @NameInMap("LogoUrl")
    public String logoUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="https://XXX.monitor.XXXXcom">https://XXX.monitor.XXXXcom</a></p>
     */
    @NameInMap("MonitorUrl")
    public String monitorUrl;

    /**
     * <strong>example:</strong>
     * <p>B9A68671-BD84-55CD-807A-XXXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;positionId\&quot;:XX,\&quot;componentId\&quot;:XX,\&quot;date\&quot;:\&quot;XXX\&quot;},{\&quot;positionId\&quot;:X,\&quot;componentId\&quot;:X,\&quot;date\&quot;:\&quot;XXX\&quot;},{\&quot;positionId\&quot;:X,\&quot;componentId\&quot;:X,\&quot;date\&quot;:\&quot;XX\&quot;},{\&quot;positionId\&quot;:X,\&quot;componentId\&quot;:XX,\&quot;date\&quot;:\&quot;XXX\&quot;},{\&quot;positionId\&quot;:X,\&quot;componentId\&quot;:XX,\&quot;date\&quot;:\&quot;XX\&quot;},{\&quot;positionId\&quot;:X,\&quot;componentId\&quot;:XX,\&quot;date\&quot;:\&quot;XX\&quot;},{\&quot;positionId\&quot;:X,\&quot;componentId\&quot;:XX,\&quot;date\&quot;:\&quot;XXX\&quot;},{\&quot;positionId\&quot;:X,\&quot;componentId\&quot;:,\&quot;date\&quot;:\&quot;XXXX\&quot;}]</p>
     */
    @NameInMap("ScreenDataMap")
    public String screenDataMap;

    /**
     * <strong>example:</strong>
     * <p>7849</p>
     */
    @NameInMap("ScreenDefault")
    public Integer screenDefault;

    /**
     * <strong>example:</strong>
     * <p>1004770</p>
     */
    @NameInMap("ScreenId")
    public Integer screenId;

    /**
     * <strong>example:</strong>
     * <p>Daily Report</p>
     */
    @NameInMap("Title")
    public String title;

    public static DescribeScreenSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenSettingResponseBody self = new DescribeScreenSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScreenSettingResponseBody setLogoPower(Boolean logoPower) {
        this.logoPower = logoPower;
        return this;
    }
    public Boolean getLogoPower() {
        return this.logoPower;
    }

    public DescribeScreenSettingResponseBody setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public DescribeScreenSettingResponseBody setMonitorUrl(String monitorUrl) {
        this.monitorUrl = monitorUrl;
        return this;
    }
    public String getMonitorUrl() {
        return this.monitorUrl;
    }

    public DescribeScreenSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScreenSettingResponseBody setScreenDataMap(String screenDataMap) {
        this.screenDataMap = screenDataMap;
        return this;
    }
    public String getScreenDataMap() {
        return this.screenDataMap;
    }

    public DescribeScreenSettingResponseBody setScreenDefault(Integer screenDefault) {
        this.screenDefault = screenDefault;
        return this;
    }
    public Integer getScreenDefault() {
        return this.screenDefault;
    }

    public DescribeScreenSettingResponseBody setScreenId(Integer screenId) {
        this.screenId = screenId;
        return this;
    }
    public Integer getScreenId() {
        return this.screenId;
    }

    public DescribeScreenSettingResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
