// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RestoreMediaRequest extends TeaModel {
    @NameInMap("MediaIds")
    public String mediaIds;

    @NameInMap("RestoreDays")
    public String restoreDays;

    @NameInMap("RestoreTier")
    public String restoreTier;

    @NameInMap("Scope")
    public String scope;

    public static RestoreMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreMediaRequest self = new RestoreMediaRequest();
        return TeaModel.build(map, self);
    }

    public RestoreMediaRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

    public RestoreMediaRequest setRestoreDays(String restoreDays) {
        this.restoreDays = restoreDays;
        return this;
    }
    public String getRestoreDays() {
        return this.restoreDays;
    }

    public RestoreMediaRequest setRestoreTier(String restoreTier) {
        this.restoreTier = restoreTier;
        return this;
    }
    public String getRestoreTier() {
        return this.restoreTier;
    }

    public RestoreMediaRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
