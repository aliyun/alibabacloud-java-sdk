// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class EditAppInfoRequest extends TeaModel {
    @NameInMap("AppItemId")
    public String appItemId;

    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>1-普通应用，2-内嵌SDK.</p>
     */
    @NameInMap("AppType")
    public Integer appType;

    @NameInMap("Platforms")
    public java.util.List<EditAppInfoRequestPlatforms> platforms;

    public static EditAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        EditAppInfoRequest self = new EditAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public EditAppInfoRequest setAppItemId(String appItemId) {
        this.appItemId = appItemId;
        return this;
    }
    public String getAppItemId() {
        return this.appItemId;
    }

    public EditAppInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EditAppInfoRequest setAppType(Integer appType) {
        this.appType = appType;
        return this;
    }
    public Integer getAppType() {
        return this.appType;
    }

    public EditAppInfoRequest setPlatforms(java.util.List<EditAppInfoRequestPlatforms> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<EditAppInfoRequestPlatforms> getPlatforms() {
        return this.platforms;
    }

    public static class EditAppInfoRequestPlatforms extends TeaModel {
        @NameInMap("PkgName")
        public String pkgName;

        @NameInMap("PkgSignature")
        public String pkgSignature;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PlatformType")
        public Long platformType;

        public static EditAppInfoRequestPlatforms build(java.util.Map<String, ?> map) throws Exception {
            EditAppInfoRequestPlatforms self = new EditAppInfoRequestPlatforms();
            return TeaModel.build(map, self);
        }

        public EditAppInfoRequestPlatforms setPkgName(String pkgName) {
            this.pkgName = pkgName;
            return this;
        }
        public String getPkgName() {
            return this.pkgName;
        }

        public EditAppInfoRequestPlatforms setPkgSignature(String pkgSignature) {
            this.pkgSignature = pkgSignature;
            return this;
        }
        public String getPkgSignature() {
            return this.pkgSignature;
        }

        public EditAppInfoRequestPlatforms setPlatformType(Long platformType) {
            this.platformType = platformType;
            return this;
        }
        public Long getPlatformType() {
            return this.platformType;
        }

    }

}
