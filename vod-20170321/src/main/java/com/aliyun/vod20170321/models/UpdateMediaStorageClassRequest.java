// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateMediaStorageClassRequest extends TeaModel {
    @NameInMap("MediaIds")
    public String mediaIds;

    @NameInMap("RestoreTier")
    public String restoreTier;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("StorageClass")
    public String storageClass;

    public static UpdateMediaStorageClassRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaStorageClassRequest self = new UpdateMediaStorageClassRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaStorageClassRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

    public UpdateMediaStorageClassRequest setRestoreTier(String restoreTier) {
        this.restoreTier = restoreTier;
        return this;
    }
    public String getRestoreTier() {
        return this.restoreTier;
    }

    public UpdateMediaStorageClassRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateMediaStorageClassRequest setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

}
