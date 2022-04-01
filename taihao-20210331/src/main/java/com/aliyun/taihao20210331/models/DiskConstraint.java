// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DiskConstraint extends TeaModel {
    // DiskCategoryEnum
    @NameInMap("categories")
    public java.util.List<String> categories;

    // diskCountConstraint
    @NameInMap("diskCountConstraint")
    public IntValueConstraint diskCountConstraint;

    // diskSizeConstraint
    @NameInMap("diskSizeConstraint")
    public IntValueConstraint diskSizeConstraint;

    public static DiskConstraint build(java.util.Map<String, ?> map) throws Exception {
        DiskConstraint self = new DiskConstraint();
        return TeaModel.build(map, self);
    }

    public DiskConstraint setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    public DiskConstraint setDiskCountConstraint(IntValueConstraint diskCountConstraint) {
        this.diskCountConstraint = diskCountConstraint;
        return this;
    }
    public IntValueConstraint getDiskCountConstraint() {
        return this.diskCountConstraint;
    }

    public DiskConstraint setDiskSizeConstraint(IntValueConstraint diskSizeConstraint) {
        this.diskSizeConstraint = diskSizeConstraint;
        return this;
    }
    public IntValueConstraint getDiskSizeConstraint() {
        return this.diskSizeConstraint;
    }

}
