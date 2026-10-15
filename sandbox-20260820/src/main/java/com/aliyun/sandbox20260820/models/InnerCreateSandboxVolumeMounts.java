// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class InnerCreateSandboxVolumeMounts extends TeaModel {
    /**
     * <p>The AgenticFS mount configuration.</p>
     */
    @NameInMap("agenticFs")
    public InnerCreateSandboxVolumeMountsAgenticFs agenticFs;

    /**
     * <p>The predefined volume mount configuration.</p>
     */
    @NameInMap("named")
    public InnerCreateSandboxVolumeMountsNamed named;

    /**
     * <p>The OSS mount configuration.</p>
     */
    @NameInMap("oss")
    public InnerCreateSandboxVolumeMountsOss oss;

    public static InnerCreateSandboxVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
        InnerCreateSandboxVolumeMounts self = new InnerCreateSandboxVolumeMounts();
        return TeaModel.build(map, self);
    }

    public InnerCreateSandboxVolumeMounts setAgenticFs(InnerCreateSandboxVolumeMountsAgenticFs agenticFs) {
        this.agenticFs = agenticFs;
        return this;
    }
    public InnerCreateSandboxVolumeMountsAgenticFs getAgenticFs() {
        return this.agenticFs;
    }

    public InnerCreateSandboxVolumeMounts setNamed(InnerCreateSandboxVolumeMountsNamed named) {
        this.named = named;
        return this;
    }
    public InnerCreateSandboxVolumeMountsNamed getNamed() {
        return this.named;
    }

    public InnerCreateSandboxVolumeMounts setOss(InnerCreateSandboxVolumeMountsOss oss) {
        this.oss = oss;
        return this;
    }
    public InnerCreateSandboxVolumeMountsOss getOss() {
        return this.oss;
    }

    public static class InnerCreateSandboxVolumeMountsAgenticFsMountPoints extends TeaModel {
        /**
         * <p>The local mount directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/agenticfs</p>
         */
        @NameInMap("mountDir")
        public String mountDir;

        /**
         * <p>The AgenticFS access point address.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-xxxx.03204sl2qjiax4ocdt2-ljs60.cn-shanghai.nas.aliyuncs.com</p>
         */
        @NameInMap("serverAddr")
        public String serverAddr;

        public static InnerCreateSandboxVolumeMountsAgenticFsMountPoints build(java.util.Map<String, ?> map) throws Exception {
            InnerCreateSandboxVolumeMountsAgenticFsMountPoints self = new InnerCreateSandboxVolumeMountsAgenticFsMountPoints();
            return TeaModel.build(map, self);
        }

        public InnerCreateSandboxVolumeMountsAgenticFsMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public InnerCreateSandboxVolumeMountsAgenticFsMountPoints setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

    }

    public static class InnerCreateSandboxVolumeMountsAgenticFs extends TeaModel {
        /**
         * <p>The group ID for the local mount.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("groupID")
        public Integer groupID;

        /**
         * <p>The mount point configuration.</p>
         */
        @NameInMap("mountPoints")
        public java.util.List<InnerCreateSandboxVolumeMountsAgenticFsMountPoints> mountPoints;

        /**
         * <p>The user ID for the local mount.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("userID")
        public Integer userID;

        public static InnerCreateSandboxVolumeMountsAgenticFs build(java.util.Map<String, ?> map) throws Exception {
            InnerCreateSandboxVolumeMountsAgenticFs self = new InnerCreateSandboxVolumeMountsAgenticFs();
            return TeaModel.build(map, self);
        }

        public InnerCreateSandboxVolumeMountsAgenticFs setGroupID(Integer groupID) {
            this.groupID = groupID;
            return this;
        }
        public Integer getGroupID() {
            return this.groupID;
        }

        public InnerCreateSandboxVolumeMountsAgenticFs setMountPoints(java.util.List<InnerCreateSandboxVolumeMountsAgenticFsMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<InnerCreateSandboxVolumeMountsAgenticFsMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public InnerCreateSandboxVolumeMountsAgenticFs setUserID(Integer userID) {
            this.userID = userID;
            return this;
        }
        public Integer getUserID() {
            return this.userID;
        }

    }

    public static class InnerCreateSandboxVolumeMountsNamedMountPoints extends TeaModel {
        /**
         * <p>The local mount directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/named</p>
         */
        @NameInMap("mountDir")
        public String mountDir;

        /**
         * <p>The volume name.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace</p>
         */
        @NameInMap("volumeName")
        public String volumeName;

        public static InnerCreateSandboxVolumeMountsNamedMountPoints build(java.util.Map<String, ?> map) throws Exception {
            InnerCreateSandboxVolumeMountsNamedMountPoints self = new InnerCreateSandboxVolumeMountsNamedMountPoints();
            return TeaModel.build(map, self);
        }

        public InnerCreateSandboxVolumeMountsNamedMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public InnerCreateSandboxVolumeMountsNamedMountPoints setVolumeName(String volumeName) {
            this.volumeName = volumeName;
            return this;
        }
        public String getVolumeName() {
            return this.volumeName;
        }

    }

    public static class InnerCreateSandboxVolumeMountsNamed extends TeaModel {
        /**
         * <p>The mount point configuration.</p>
         */
        @NameInMap("mountPoints")
        public java.util.List<InnerCreateSandboxVolumeMountsNamedMountPoints> mountPoints;

        public static InnerCreateSandboxVolumeMountsNamed build(java.util.Map<String, ?> map) throws Exception {
            InnerCreateSandboxVolumeMountsNamed self = new InnerCreateSandboxVolumeMountsNamed();
            return TeaModel.build(map, self);
        }

        public InnerCreateSandboxVolumeMountsNamed setMountPoints(java.util.List<InnerCreateSandboxVolumeMountsNamedMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<InnerCreateSandboxVolumeMountsNamedMountPoints> getMountPoints() {
            return this.mountPoints;
        }

    }

    public static class InnerCreateSandboxVolumeMountsOssMountPoints extends TeaModel {
        /**
         * <p>The bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-bucket-test</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The OSS bucket path to mount.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("bucketPath")
        public String bucketPath;

        /**
         * <p>The endpoint URL of OSS.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-cn-shenzhen-internal.aliyuncs.com">https://oss-cn-shenzhen-internal.aliyuncs.com</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The local mount directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/oss</p>
         */
        @NameInMap("mountDir")
        public String mountDir;

        /**
         * <p>Specifies whether the mount is read-only. Valid values:</p>
         * <ul>
         * <li>true: Read-only.</li>
         * <li>false: Read and write.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static InnerCreateSandboxVolumeMountsOssMountPoints build(java.util.Map<String, ?> map) throws Exception {
            InnerCreateSandboxVolumeMountsOssMountPoints self = new InnerCreateSandboxVolumeMountsOssMountPoints();
            return TeaModel.build(map, self);
        }

        public InnerCreateSandboxVolumeMountsOssMountPoints setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public InnerCreateSandboxVolumeMountsOssMountPoints setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public InnerCreateSandboxVolumeMountsOssMountPoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public InnerCreateSandboxVolumeMountsOssMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public InnerCreateSandboxVolumeMountsOssMountPoints setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class InnerCreateSandboxVolumeMountsOss extends TeaModel {
        /**
         * <p>The mount point configuration.</p>
         */
        @NameInMap("mountPoints")
        public java.util.List<InnerCreateSandboxVolumeMountsOssMountPoints> mountPoints;

        public static InnerCreateSandboxVolumeMountsOss build(java.util.Map<String, ?> map) throws Exception {
            InnerCreateSandboxVolumeMountsOss self = new InnerCreateSandboxVolumeMountsOss();
            return TeaModel.build(map, self);
        }

        public InnerCreateSandboxVolumeMountsOss setMountPoints(java.util.List<InnerCreateSandboxVolumeMountsOssMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<InnerCreateSandboxVolumeMountsOssMountPoints> getMountPoints() {
            return this.mountPoints;
        }

    }

}
