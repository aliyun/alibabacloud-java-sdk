// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class CreateScreenSettingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Integer id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LogoPower")
    public Boolean logoPower;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/xxxx.png">https://img.alicdn.com/tfs/xxxx.png</a></p>
     */
    @NameInMap("LogoUrl")
    public String logoUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="https://monitor.xxxxxxx">https://monitor.xxxxxxx</a></p>
     */
    @NameInMap("MonitorUrl")
    public String monitorUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;positionId&quot;:1,&quot;componentId&quot;:3,&quot;date&quot;:&quot;7-day&quot;},{&quot;positionId&quot;:2,&quot;componentId&quot;:1,&quot;date&quot;:&quot;0-second&quot;},{&quot;positionId&quot;:3,&quot;componentId&quot;:8,&quot;date&quot;:&quot;15-day&quot;},{&quot;positionId&quot;:4,&quot;componentId&quot;:11,&quot;date&quot;:&quot;15-day&quot;},{&quot;positionId&quot;:5,&quot;componentId&quot;:23,&quot;date&quot;:&quot;24-hour&quot;},{&quot;positionId&quot;:6,&quot;componentId&quot;:17,&quot;date&quot;:&quot;24-hour&quot;},{&quot;positionId&quot;:7,&quot;componentId&quot;:13,&quot;date&quot;:&quot;24-hour&quot;},{&quot;positionId&quot;:8,&quot;componentId&quot;:25,&quot;date&quot;:&quot;0-second&quot;}]</p>
     */
    @NameInMap("ScreenDataMap")
    public String screenDataMap;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ScreenDefault")
    public Integer screenDefault;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateScreenSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScreenSettingRequest self = new CreateScreenSettingRequest();
        return TeaModel.build(map, self);
    }

    public CreateScreenSettingRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public CreateScreenSettingRequest setLogoPower(Boolean logoPower) {
        this.logoPower = logoPower;
        return this;
    }
    public Boolean getLogoPower() {
        return this.logoPower;
    }

    public CreateScreenSettingRequest setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public CreateScreenSettingRequest setMonitorUrl(String monitorUrl) {
        this.monitorUrl = monitorUrl;
        return this;
    }
    public String getMonitorUrl() {
        return this.monitorUrl;
    }

    public CreateScreenSettingRequest setScreenDataMap(String screenDataMap) {
        this.screenDataMap = screenDataMap;
        return this;
    }
    public String getScreenDataMap() {
        return this.screenDataMap;
    }

    public CreateScreenSettingRequest setScreenDefault(Integer screenDefault) {
        this.screenDefault = screenDefault;
        return this;
    }
    public Integer getScreenDefault() {
        return this.screenDefault;
    }

    public CreateScreenSettingRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
