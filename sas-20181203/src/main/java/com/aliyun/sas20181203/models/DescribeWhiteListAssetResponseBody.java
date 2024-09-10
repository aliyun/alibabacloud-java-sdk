// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListAssetResponseBody extends TeaModel {
    /**
     * <p>The information about the servers.</p>
     */
    @NameInMap("Assets")
    public java.util.List<DescribeWhiteListAssetResponseBodyAssets> assets;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3D7C47D-3F11-57BB-90E8-E5C20C61****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWhiteListAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListAssetResponseBody self = new DescribeWhiteListAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListAssetResponseBody setAssets(java.util.List<DescribeWhiteListAssetResponseBodyAssets> assets) {
        this.assets = assets;
        return this;
    }
    public java.util.List<DescribeWhiteListAssetResponseBodyAssets> getAssets() {
        return this.assets;
    }

    public DescribeWhiteListAssetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWhiteListAssetResponseBodyAssets extends TeaModel {
        /**
         * <p>Indicates whether the server can be selected. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllowSelected")
        public Integer allowSelected;

        /**
         * <p>The group ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>11028551</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>121.41.XX.XX</p>
         */
        @NameInMap("MachineIp")
        public String machineIp;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MachineName")
        public String machineName;

        /**
         * <p>Indicates whether the server is selected. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Selected")
        public Integer selected;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>5c081b02-f66a-47a4-bd2f-79ee3eaf806a</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeWhiteListAssetResponseBodyAssets build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteListAssetResponseBodyAssets self = new DescribeWhiteListAssetResponseBodyAssets();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteListAssetResponseBodyAssets setAllowSelected(Integer allowSelected) {
            this.allowSelected = allowSelected;
            return this;
        }
        public Integer getAllowSelected() {
            return this.allowSelected;
        }

        public DescribeWhiteListAssetResponseBodyAssets setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeWhiteListAssetResponseBodyAssets setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeWhiteListAssetResponseBodyAssets setMachineIp(String machineIp) {
            this.machineIp = machineIp;
            return this;
        }
        public String getMachineIp() {
            return this.machineIp;
        }

        public DescribeWhiteListAssetResponseBodyAssets setMachineName(String machineName) {
            this.machineName = machineName;
            return this;
        }
        public String getMachineName() {
            return this.machineName;
        }

        public DescribeWhiteListAssetResponseBodyAssets setSelected(Integer selected) {
            this.selected = selected;
            return this;
        }
        public Integer getSelected() {
            return this.selected;
        }

        public DescribeWhiteListAssetResponseBodyAssets setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
