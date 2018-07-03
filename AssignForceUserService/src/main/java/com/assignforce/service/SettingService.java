package com.assignforce.service;

import com.assignforce.models.Setting;
import com.assignforce.models.User;

import java.util.List;

public interface SettingService {
    List<Setting> getAll();
    Setting add(Setting setting);
    Setting getById(int id);
    Setting update(Setting setting);
}

