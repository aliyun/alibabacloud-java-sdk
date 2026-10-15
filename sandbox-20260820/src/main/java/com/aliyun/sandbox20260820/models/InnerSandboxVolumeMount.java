// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class InnerSandboxVolumeMount extends TeaModel {
    /**
     * <p>The AgenticFS mount configuration.</p>
     */
    @NameInMap("agenticFs")
    public InnerSandboxVolumeMountAgenticFs agenticFs;

    /**
     * <p>The predefined volume mount configuration.</p>
     */
    @NameInMap("named")
    public InnerSandboxVolumeMountNamed named;

    /**
     * <p>The OSS mount configuration.</p>
     */
    @NameInMap("oss")
    public InnerSandboxVolumeMountOss oss;

    public static InnerSandboxVolumeMount build(java.util.Map<String, ?> map) throws Exception {
        InnerSandboxVolumeMount self = new InnerSandboxVolumeMount();
        return TeaModel.build(map, self);
    }

    public InnerSandboxVolumeMount setAgenticFs(InnerSandboxVolumeMountAgenticFs agenticFs) {
        this.agenticFs = agenticFs;
        return this;
    }
    public InnerSandboxVolumeMountAgenticFs getAgenticFs() {
        return this.agenticFs;
    }

    public InnerSandboxVolumeMount setNamed(InnerSandboxVolumeMountNamed named) {
        this.named = named;
        return this;
    }
    public InnerSandboxVolumeMountNamed getNamed() {
        return this.named;
    }

    public InnerSandboxVolumeMount setOss(InnerSandboxVolumeMountOss oss) {
        this.oss = oss;
        return this;
    }
    public InnerSandboxVolumeMountOss getOss() {
        return this.oss;
    }

    public static class InnerSandboxVolumeMountAgenticFsMountPoints extends TeaModel {
        /**
         * <p>The access point ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-xxxx</p>
         */
        @NameInMap("accessPointID")
        public String accessPointID;

        /**
         * <p>The AgenticSpace workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agentic-xxxx</p>
         */
        @NameInMap("agenticSpaceID")
        public String agenticSpaceID;

        /**
         * <p>The file system ID.</p>
         * 
         * <strong>example:</strong>
         * <p>03204sl2qjiax4oxxxx</p>
         */
        @NameInMap("fileSystemID")
        public String fileSystemID;

        /**
         * <p>The local mount directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/agenticfs</p>
         */
        @NameInMap("mountDir")
        public String mountDir;

        /**
         * <p>The access point mount address.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-xxxx.xxxx-ljs60.cn-shanghai.nas.aliyuncs.com</p>
         */
        @NameInMap("serverAddr")
        public String serverAddr;

        public static InnerSandboxVolumeMountAgenticFsMountPoints build(java.util.Map<String, ?> map) throws Exception {
            InnerSandboxVolumeMountAgenticFsMountPoints self = new InnerSandboxVolumeMountAgenticFsMountPoints();
            return TeaModel.build(map, self);
        }

        public InnerSandboxVolumeMountAgenticFsMountPoints setAccessPointID(String accessPointID) {
            this.accessPointID = accessPointID;
            return this;
        }
        public String getAccessPointID() {
            return this.accessPointID;
        }

        public InnerSandboxVolumeMountAgenticFsMountPoints setAgenticSpaceID(String agenticSpaceID) {
            this.agenticSpaceID = agenticSpaceID;
            return this;
        }
        public String getAgenticSpaceID() {
            return this.agenticSpaceID;
        }

        public InnerSandboxVolumeMountAgenticFsMountPoints setFileSystemID(String fileSystemID) {
            this.fileSystemID = fileSystemID;
            return this;
        }
        public String getFileSystemID() {
            return this.fileSystemID;
        }

        public InnerSandboxVolumeMountAgenticFsMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public InnerSandboxVolumeMountAgenticFsMountPoints setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

    }

    public static class InnerSandboxVolumeMountAgenticFs extends TeaModel {
        /**
         * <p>The local mount group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("groupID")
        public Integer groupID;

        /**
         * <p>The AgenticFS mount point configuration.</p>
         */
        @NameInMap("mountPoints")
        public java.util.List<InnerSandboxVolumeMountAgenticFsMountPoints> mountPoints;

        /**
         * <p>The local mount user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("userID")
        public Integer userID;

        public static InnerSandboxVolumeMountAgenticFs build(java.util.Map<String, ?> map) throws Exception {
            InnerSandboxVolumeMountAgenticFs self = new InnerSandboxVolumeMountAgenticFs();
            return TeaModel.build(map, self);
        }

        public InnerSandboxVolumeMountAgenticFs setGroupID(Integer groupID) {
            this.groupID = groupID;
            return this;
        }
        public Integer getGroupID() {
            return this.groupID;
        }

        public InnerSandboxVolumeMountAgenticFs setMountPoints(java.util.List<InnerSandboxVolumeMountAgenticFsMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<InnerSandboxVolumeMountAgenticFsMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public InnerSandboxVolumeMountAgenticFs setUserID(Integer userID) {
            this.userID = userID;
            return this;
        }
        public Integer getUserID() {
            return this.userID;
        }

    }

    public static class InnerSandboxVolumeMountNamedMountPoints extends TeaModel {
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

        public static InnerSandboxVolumeMountNamedMountPoints build(java.util.Map<String, ?> map) throws Exception {
            InnerSandboxVolumeMountNamedMountPoints self = new InnerSandboxVolumeMountNamedMountPoints();
            return TeaModel.build(map, self);
        }

        public InnerSandboxVolumeMountNamedMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public InnerSandboxVolumeMountNamedMountPoints setVolumeName(String volumeName) {
            this.volumeName = volumeName;
            return this;
        }
        public String getVolumeName() {
            return this.volumeName;
        }

    }

    public static class InnerSandboxVolumeMountNamed extends TeaModel {
        /**
         * <p>The mount point configuration.</p>
         */
        @NameInMap("mountPoints")
        public java.util.List<InnerSandboxVolumeMountNamedMountPoints> mountPoints;

        public static InnerSandboxVolumeMountNamed build(java.util.Map<String, ?> map) throws Exception {
            InnerSandboxVolumeMountNamed self = new InnerSandboxVolumeMountNamed();
            return TeaModel.build(map, self);
        }

        public InnerSandboxVolumeMountNamed setMountPoints(java.util.List<InnerSandboxVolumeMountNamedMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<InnerSandboxVolumeMountNamedMountPoints> getMountPoints() {
            return this.mountPoints;
        }

    }

    public static class InnerSandboxVolumeMountOssMountPoints extends TeaModel {
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
         * <p>The OSS endpoint address.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shenzhen-internal.aliyuncs.com</p>
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
         * <li><p><strong>true</strong>: Read-only.</p>
         * </li>
         * <li><p><strong>false</strong>: Not read-only.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static InnerSandboxVolumeMountOssMountPoints build(java.util.Map<String, ?> map) throws Exception {
            InnerSandboxVolumeMountOssMountPoints self = new InnerSandboxVolumeMountOssMountPoints();
            return TeaModel.build(map, self);
        }

        public InnerSandboxVolumeMountOssMountPoints setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public InnerSandboxVolumeMountOssMountPoints setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public InnerSandboxVolumeMountOssMountPoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public InnerSandboxVolumeMountOssMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public InnerSandboxVolumeMountOssMountPoints setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class InnerSandboxVolumeMountOss extends TeaModel {
        /**
         * <p>The mount point configuration.</p>
         */
        @NameInMap("mountPoints")
        public java.util.List<InnerSandboxVolumeMountOssMountPoints> mountPoints;

        public static InnerSandboxVolumeMountOss build(java.util.Map<String, ?> map) throws Exception {
            InnerSandboxVolumeMountOss self = new InnerSandboxVolumeMountOss();
            return TeaModel.build(map, self);
        }

        public InnerSandboxVolumeMountOss setMountPoints(java.util.List<InnerSandboxVolumeMountOssMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<InnerSandboxVolumeMountOssMountPoints> getMountPoints() {
            return this.mountPoints;
        }

    }

}
