// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdatePostPaidBindRelRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic binding for new assets. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled</li>
     * <li><strong>1</strong>: enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoBind")
    public Integer autoBind;

    /**
     * <p>The edition to automatically bind when new assets are added. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Free Edition </li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>5</strong>: Advanced Edition</li>
     * <li><strong>6</strong>: Anti-virus Edition    </li>
     * <li><strong>7</strong>: Ultimate Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AutoBindVersion")
    public Integer autoBindVersion;

    /**
     * <p>The binding action parameter.</p>
     */
    @NameInMap("BindAction")
    public java.util.List<UpdatePostPaidBindRelRequestBindAction> bindAction;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Different requests must use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Specifies whether to forcibly upgrade the edition.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UpdateIfNecessary")
    public Boolean updateIfNecessary;

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

    public UpdatePostPaidBindRelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdatePostPaidBindRelRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public UpdatePostPaidBindRelRequest setUpdateIfNecessary(Boolean updateIfNecessary) {
        this.updateIfNecessary = updateIfNecessary;
        return this;
    }
    public Boolean getUpdateIfNecessary() {
        return this.updateIfNecessary;
    }

    public static class UpdatePostPaidBindRelRequestBindAction extends TeaModel {
        /**
         * <p>Specifies whether to bind all servers. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BindAll")
        public Boolean bindAll;

        @NameInMap("FreeType")
        public String freeType;

        /**
         * <p>The list of server UUIDs.</p>
         */
        @NameInMap("UuidList")
        public java.util.List<String> uuidList;

        /**
         * <p>The protection edition of Security Center to bind. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Free Edition </li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>5</strong>: Advanced Edition</li>
         * <li><strong>6</strong>: Anti-virus Edition    </li>
         * <li><strong>7</strong>: Ultimate Edition</li>
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

        public UpdatePostPaidBindRelRequestBindAction setFreeType(String freeType) {
            this.freeType = freeType;
            return this;
        }
        public String getFreeType() {
            return this.freeType;
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
