// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class ListRolesForServiceRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("Service")
    public String service;

    public static ListRolesForServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRolesForServiceRequest self = new ListRolesForServiceRequest();
        return TeaModel.build(map, self);
    }

    public ListRolesForServiceRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListRolesForServiceRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
