// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class ImportDevicesRequest extends TeaModel {
    @NameInMap("DeviceList")
    public String deviceList;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VcsId")
    public String vcsId;

    public static ImportDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDevicesRequest self = new ImportDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ImportDevicesRequest setDeviceList(String deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public String getDeviceList() {
        return this.deviceList;
    }

    public ImportDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ImportDevicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportDevicesRequest setVcsId(String vcsId) {
        this.vcsId = vcsId;
        return this;
    }
    public String getVcsId() {
        return this.vcsId;
    }

}
