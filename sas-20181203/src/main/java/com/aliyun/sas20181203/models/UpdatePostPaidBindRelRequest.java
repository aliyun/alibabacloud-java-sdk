// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdatePostPaidBindRelRequest extends TeaModel {
    /**
     * <p>Enable automatic binding for new assets. Values:</p>
     * <ul>
     * <li><strong>0</strong>: Off</li>
     * <li><strong>1</strong>: On</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoBind")
    public Integer autoBind;

    /**
     * <p>Version to automatically bind when adding new assets. Values:</p>
     * <ul>
     * <li><strong>1</strong>: Basic Edition </li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>5</strong>: Advanced Edition</li>
     * <li><strong>6</strong>: Antivirus Edition    </li>
     * <li><strong>7</strong>: Container Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AutoBindVersion")
    public Integer autoBindVersion;

    /**
     * <p>Parameters for the binding action.</p>
     */
    @NameInMap("BindAction")
    public java.util.List<UpdatePostPaidBindRelRequestBindAction> bindAction;

    public static UpdatePostPaidBindRelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePostPaidBindRelRequest self = new UpdatePostPaidBindRelRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePostPaidBindRelRequest setAutoBind(Integer autoBind) {
        this.autoBind = autoBind;
        return this;
    }
    public Integer getAutoBind() {
        return this.autoBind;
    }

    public UpdatePostPaidBindRelRequest setAutoBindVersion(Integer autoBindVersion) {
        this.autoBindVersion = autoBindVersion;
        return this;
    }
    public Integer getAutoBindVersion() {
        return this.autoBindVersion;
    }

    public UpdatePostPaidBindRelRequest setBindAction(java.util.List<UpdatePostPaidBindRelRequestBindAction> bindAction) {
        this.bindAction = bindAction;
        return this;
    }
    public java.util.List<UpdatePostPaidBindRelRequestBindAction> getBindAction() {
        return this.bindAction;
    }

    public static class UpdatePostPaidBindRelRequestBindAction extends TeaModel {
        /**
         * <p>Whether to bind all. Default is <strong>false</strong>. Values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes</li>
         * <li><strong>false</strong>: No</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BindAll")
        public Boolean bindAll;

        /**
         * <p>List of specified server UUIDs.</p>
         */
        @NameInMap("UuidList")
        public java.util.List<String> uuidList;

        /**
         * <p>The Cloud Security Center protection version that needs to be bound. Values:  </p>
         * <ul>
         * <li><strong>1</strong>: Basic Edition </li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>5</strong>: Advanced Edition</li>
         * <li><strong>6</strong>: Antivirus Edition    </li>
         * <li><strong>7</strong>: Container Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Version")
        public String version;

        public static UpdatePostPaidBindRelRequestBindAction build(java.util.Map<String, ?> map) throws Exception {
            UpdatePostPaidBindRelRequestBindAction self = new UpdatePostPaidBindRelRequestBindAction();
            return TeaModel.build(map, self);
        }

        public UpdatePostPaidBindRelRequestBindAction setBindAll(Boolean bindAll) {
            this.bindAll = bindAll;
            return this;
        }
        public Boolean getBindAll() {
            return this.bindAll;
        }

        public UpdatePostPaidBindRelRequestBindAction setUuidList(java.util.List<String> uuidList) {
            this.uuidList = uuidList;
            return this;
        }
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

        public UpdatePostPaidBindRelRequestBindAction setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
