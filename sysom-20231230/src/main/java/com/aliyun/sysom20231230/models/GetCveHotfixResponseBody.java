// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetCveHotfixResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li>If <code>code == Success</code>, the authorization is successful.</li>
     * <li>Other status codes indicate that the authorization failed. If the authorization failed, check the <code>message</code> field for the detailed fault information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public java.util.List<GetCveHotfixResponseBodyData> data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>example-request-id</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetCveHotfixResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCveHotfixResponseBody self = new GetCveHotfixResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCveHotfixResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCveHotfixResponseBody setData(java.util.List<GetCveHotfixResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCveHotfixResponseBodyData> getData() {
        return this.data;
    }

    public GetCveHotfixResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCveHotfixResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCveHotfixResponseBodyDataHotfixPackages extends TeaModel {
        /**
         * <p>The architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("arch")
        public String arch;

        /**
         * <p>The distribution. This value is null if the distribution is not registered.</p>
         * 
         * <strong>example:</strong>
         * <p>alinux3</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("distro")
        public String distro;

        /**
         * <p>The compatible full kernel version.</p>
         * 
         * <strong>example:</strong>
         * <p>5.10.134-18.al8.x86_64</p>
         */
        @NameInMap("kernelVersion")
        public String kernelVersion;

        /**
         * <p>The RPM package identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>kernel-hotfix-example-1.0-1.x86_64</p>
         */
        @NameInMap("rpmNevra")
        public String rpmNevra;

        public static GetCveHotfixResponseBodyDataHotfixPackages build(java.util.Map<String, ?> map) throws Exception {
            GetCveHotfixResponseBodyDataHotfixPackages self = new GetCveHotfixResponseBodyDataHotfixPackages();
            return TeaModel.build(map, self);
        }

        public GetCveHotfixResponseBodyDataHotfixPackages setArch(String arch) {
            this.arch = arch;
            return this;
        }
        public String getArch() {
            return this.arch;
        }

        public GetCveHotfixResponseBodyDataHotfixPackages setDistro(String distro) {
            this.distro = distro;
            return this;
        }
        public String getDistro() {
            return this.distro;
        }

        public GetCveHotfixResponseBodyDataHotfixPackages setKernelVersion(String kernelVersion) {
            this.kernelVersion = kernelVersion;
            return this;
        }
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        public GetCveHotfixResponseBodyDataHotfixPackages setRpmNevra(String rpmNevra) {
            this.rpmNevra = rpmNevra;
            return this;
        }
        public String getRpmNevra() {
            return this.rpmNevra;
        }

    }

    public static class GetCveHotfixResponseBodyDataHotfix extends TeaModel {
        /**
         * <p>The hotfix description.</p>
         * 
         * <strong>example:</strong>
         * <p>Fixes the kernel issue corresponding to the CVE</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The hotfix name.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("hotfixName")
        public String hotfixName;

        /**
         * <p>The hotfix module name.</p>
         * 
         * <strong>example:</strong>
         * <p>kpatch_example</p>
         */
        @NameInMap("moduleName")
        public String moduleName;

        /**
         * <p>The list of published packages that meet the kernel requirements.</p>
         */
        @NameInMap("packages")
        public java.util.List<GetCveHotfixResponseBodyDataHotfixPackages> packages;

        /**
         * <p>The hotfix version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("version")
        public String version;

        public static GetCveHotfixResponseBodyDataHotfix build(java.util.Map<String, ?> map) throws Exception {
            GetCveHotfixResponseBodyDataHotfix self = new GetCveHotfixResponseBodyDataHotfix();
            return TeaModel.build(map, self);
        }

        public GetCveHotfixResponseBodyDataHotfix setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCveHotfixResponseBodyDataHotfix setHotfixName(String hotfixName) {
            this.hotfixName = hotfixName;
            return this;
        }
        public String getHotfixName() {
            return this.hotfixName;
        }

        public GetCveHotfixResponseBodyDataHotfix setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public GetCveHotfixResponseBodyDataHotfix setPackages(java.util.List<GetCveHotfixResponseBodyDataHotfixPackages> packages) {
            this.packages = packages;
            return this;
        }
        public java.util.List<GetCveHotfixResponseBodyDataHotfixPackages> getPackages() {
            return this.packages;
        }

        public GetCveHotfixResponseBodyDataHotfix setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetCveHotfixResponseBodyData extends TeaModel {
        /**
         * <p>The CVE ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2026-12345</p>
         */
        @NameInMap("cveId")
        public String cveId;

        /**
         * <p>The hotfix information for the CVE.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("hotfix")
        public GetCveHotfixResponseBodyDataHotfix hotfix;

        public static GetCveHotfixResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCveHotfixResponseBodyData self = new GetCveHotfixResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCveHotfixResponseBodyData setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public GetCveHotfixResponseBodyData setHotfix(GetCveHotfixResponseBodyDataHotfix hotfix) {
            this.hotfix = hotfix;
            return this;
        }
        public GetCveHotfixResponseBodyDataHotfix getHotfix() {
            return this.hotfix;
        }

    }

}
