// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SourceCodeAccount extends TeaModel {
    @NameInMap("AvatarUrl")
    public String avatarUrl;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Organizations")
    public java.util.List<SourceCodeAccountOrganizations> organizations;

    public static SourceCodeAccount build(java.util.Map<String, ?> map) throws Exception {
        SourceCodeAccount self = new SourceCodeAccount();
        return TeaModel.build(map, self);
    }

    public SourceCodeAccount setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public SourceCodeAccount setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SourceCodeAccount setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SourceCodeAccount setOrganizations(java.util.List<SourceCodeAccountOrganizations> organizations) {
        this.organizations = organizations;
        return this;
    }
    public java.util.List<SourceCodeAccountOrganizations> getOrganizations() {
        return this.organizations;
    }

    public static class SourceCodeAccountOrganizations extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static SourceCodeAccountOrganizations build(java.util.Map<String, ?> map) throws Exception {
            SourceCodeAccountOrganizations self = new SourceCodeAccountOrganizations();
            return TeaModel.build(map, self);
        }

        public SourceCodeAccountOrganizations setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public SourceCodeAccountOrganizations setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SourceCodeAccountOrganizations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
