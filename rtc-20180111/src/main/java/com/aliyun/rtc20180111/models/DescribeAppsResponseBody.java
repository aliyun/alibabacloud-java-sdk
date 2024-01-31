// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppsResponseBody extends TeaModel {
    @NameInMap("AppList")
    public DescribeAppsResponseBodyAppList appList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNum")
    public Integer totalNum;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsResponseBody self = new DescribeAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppsResponseBody setAppList(DescribeAppsResponseBodyAppList appList) {
        this.appList = appList;
        return this;
    }
    public DescribeAppsResponseBodyAppList getAppList() {
        return this.appList;
    }

    public DescribeAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeAppsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeAppsResponseBodyAppListAppServiceAreas extends TeaModel {
        @NameInMap("ServiceArea")
        public java.util.List<String> serviceArea;

        public static DescribeAppsResponseBodyAppListAppServiceAreas build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyAppListAppServiceAreas self = new DescribeAppsResponseBodyAppListAppServiceAreas();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyAppListAppServiceAreas setServiceArea(java.util.List<String> serviceArea) {
            this.serviceArea = serviceArea;
            return this;
        }
        public java.util.List<String> getServiceArea() {
            return this.serviceArea;
        }

    }

    public static class DescribeAppsResponseBodyAppListApp extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("BillType")
        public String billType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ServiceAreas")
        public DescribeAppsResponseBodyAppListAppServiceAreas serviceAreas;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Version")
        public String version;

        public static DescribeAppsResponseBodyAppListApp build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyAppListApp self = new DescribeAppsResponseBodyAppListApp();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyAppListApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeAppsResponseBodyAppListApp setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppsResponseBodyAppListApp setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public DescribeAppsResponseBodyAppListApp setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public DescribeAppsResponseBodyAppListApp setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAppsResponseBodyAppListApp setServiceAreas(DescribeAppsResponseBodyAppListAppServiceAreas serviceAreas) {
            this.serviceAreas = serviceAreas;
            return this;
        }
        public DescribeAppsResponseBodyAppListAppServiceAreas getServiceAreas() {
            return this.serviceAreas;
        }

        public DescribeAppsResponseBodyAppListApp setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeAppsResponseBodyAppListApp setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAppsResponseBodyAppList extends TeaModel {
        @NameInMap("App")
        public java.util.List<DescribeAppsResponseBodyAppListApp> app;

        public static DescribeAppsResponseBodyAppList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyAppList self = new DescribeAppsResponseBodyAppList();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyAppList setApp(java.util.List<DescribeAppsResponseBodyAppListApp> app) {
            this.app = app;
            return this;
        }
        public java.util.List<DescribeAppsResponseBodyAppListApp> getApp() {
            return this.app;
        }

    }

}
