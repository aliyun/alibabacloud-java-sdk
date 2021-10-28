// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckUpgradeVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LatestVersion")
    public String latestVersion;

    @NameInMap("Message")
    public String message;

    @NameInMap("Option")
    public String option;

    @NameInMap("Patches")
    public CheckUpgradeVersionResponseBodyPatches patches;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckUpgradeVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUpgradeVersionResponseBody self = new CheckUpgradeVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUpgradeVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckUpgradeVersionResponseBody setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public String getLatestVersion() {
        return this.latestVersion;
    }

    public CheckUpgradeVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckUpgradeVersionResponseBody setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public CheckUpgradeVersionResponseBody setPatches(CheckUpgradeVersionResponseBodyPatches patches) {
        this.patches = patches;
        return this;
    }
    public CheckUpgradeVersionResponseBodyPatches getPatches() {
        return this.patches;
    }

    public CheckUpgradeVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckUpgradeVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckUpgradeVersionResponseBodyPatchesPatch extends TeaModel {
        @NameInMap("InternalUrl")
        public String internalUrl;

        @NameInMap("MD5")
        public String MD5;

        @NameInMap("Name")
        public String name;

        @NameInMap("Url")
        public String url;

        public static CheckUpgradeVersionResponseBodyPatchesPatch build(java.util.Map<String, ?> map) throws Exception {
            CheckUpgradeVersionResponseBodyPatchesPatch self = new CheckUpgradeVersionResponseBodyPatchesPatch();
            return TeaModel.build(map, self);
        }

        public CheckUpgradeVersionResponseBodyPatchesPatch setInternalUrl(String internalUrl) {
            this.internalUrl = internalUrl;
            return this;
        }
        public String getInternalUrl() {
            return this.internalUrl;
        }

        public CheckUpgradeVersionResponseBodyPatchesPatch setMD5(String MD5) {
            this.MD5 = MD5;
            return this;
        }
        public String getMD5() {
            return this.MD5;
        }

        public CheckUpgradeVersionResponseBodyPatchesPatch setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CheckUpgradeVersionResponseBodyPatchesPatch setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CheckUpgradeVersionResponseBodyPatches extends TeaModel {
        @NameInMap("Patch")
        public java.util.List<CheckUpgradeVersionResponseBodyPatchesPatch> patch;

        public static CheckUpgradeVersionResponseBodyPatches build(java.util.Map<String, ?> map) throws Exception {
            CheckUpgradeVersionResponseBodyPatches self = new CheckUpgradeVersionResponseBodyPatches();
            return TeaModel.build(map, self);
        }

        public CheckUpgradeVersionResponseBodyPatches setPatch(java.util.List<CheckUpgradeVersionResponseBodyPatchesPatch> patch) {
            this.patch = patch;
            return this;
        }
        public java.util.List<CheckUpgradeVersionResponseBodyPatchesPatch> getPatch() {
            return this.patch;
        }

    }

}
